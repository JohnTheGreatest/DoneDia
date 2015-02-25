$(document).ready(function(){
    var $dropdownContainer = $(".dropdown");
    var $currentCategoryElem = $dropdownContainer.find('.dg-feed_filter__section__content');
    /** Кнопка доп. загрузки статей */
    var $loadMoreBtn = $('.dg-feed__btn:not(.footer-subscribe__btn)');
    
    $('#layerslider').layerSlider({
        skinsPath : 'images/skins/',
        globalBGColor : '#333',
        skin : 'defaultskin',
        autoStart: false,
        pauseOnHover : 'false'
    });

    $loadMoreBtn.hover(function(e){
        $(this ).find(".load-icon").toggleClass("load-animation");
    });

    $(".dg-team__person" ).hover(function(e){
        $(this ).find(".dg-team__person__hover").toggleClass("animated flipInY");
    });

    /* HyperComments
      * _hcwp = window._hcwp || [];
     _hcwp.push({widget:"Stream", widget_id: 20422});
     (function() {
     if("HC_LOAD_INIT" in window)return;
     HC_LOAD_INIT = true;
     var lang = (navigator.language || navigator.systemLanguage || navigator.userLanguage || "en").substr(0, 2).toLowerCase();
     var hcc = document.createElement("script"); hcc.type = "text/javascript"; hcc.async = true;
     hcc.src = ("https:" == document.location.protocol ? "https" : "http")+"://w.hypercomments.com/widget/hc/20422/"+lang+"/widget.js";
     var s = document.getElementsByTagName("script")[0];
     s.parentNode.insertBefore(hcc, s.nextSibling);
     })();
     */

    /* DROPDOWN MENU */

    

    // Контейнер для блоков статей
    var $feedContainer = $('.dg-feed__content');
    
    // Onclick on a dropdown, toggle visibility
    $dropdownContainer.find("dt").click(function(){
        console.log('click')
        $dropdownContainer.find("dd ul").hide();
        $(this).next().children().toggle();
    });

    /**
     *  Обновляем содержание блока поста, на новые данные
     */
    function refreshPostBlock($postBlock, postData) {
        // Меняем категорию
        $postBlock.find('.dg-feed__info__util__sector').text(postData.category);
        // Ссылки
        $postBlock.find('.dg-feed__image').attr('href', '/' + postData.id + '/' + postData.slug);
        $postBlock.find('.dg-feed__info__header').attr('href', '/' + postData.id + '/' + postData.slug);
        // Картинку
        $postBlock.find('.dg-feed__image').css('background-image', 'url(' + postData.thumbUrl + ')');
        // Время на прочтение
        $postBlock.find('.dg-feed__info__util__time').text(postData.minToRead + ' мин');
        // Заголовок
        $postBlock.find('.dg-feed__info__header h2').text(postData.title);
        // Тэги
        var $newTagList = $('<ul></ul>');
        $(postData.tags).each(function(index, tag){
            $newTagList.append('<li>#' + tag + '</li>');
        });
        $postBlock.find('.dg-feed__info__tags').empty().append($newTagList);
        // Переинициализируем плюсы (пока не знаю как)
        $postBlock.find('.dg-feed__info__actions').hide();
        // Переинициализируем кол-во комментов от DISQUS (тоже пока не знаю)
    }
    
    // Нажатие на категорию из выпадающего списка
    $dropdownContainer.find("dd ul li a").click(function(e){
        var $this = $(this);

        // проверка, выбрана текущая категория или другая
        // Если текущцая, ничего не делаем, иначе продолжаем
        var $selectedCategoryElem = $this;
        if($selectedCategoryElem.hasClass('selected')) return;

        // Называние выбранной категории
        var selectedCategory = $selectedCategoryElem.text();

        // Отправить запрос на получение данных
        // Если выбраны все разделы, отправляем запрос без параметра category. 
        // Чтобы получить все посты.
        var url = '/blogAjax';
        if(!$selectedCategoryElem.hasClass('default')){
            url = url + '?category=' + selectedCategory;
        }
        $.get(url, function(data) {
            console.log(data);
            var posts = data.posts;
            
            // В зависимости от кол-ва возвращенных статей, скрыть лишние блоки.
            // Если вернулось 0 статей, отобразить сообщение что в данной категории нет статей.
            
            // Получаем кол-во возвращенных статей
            var numArticles = posts.length;
            
            // делаем видимыми кол-во блоков == кол-во полученных статей
            // остальные скрываем
            $feedContainer.find('> div').each(function(index, article){
                var $article = $(article);
                
                // Если блоков с постами больше 4, удаляем лишние (по умолчанию 4 - это максимум)
                if(index > 3) {
                    $article.remove();
                    return;
                }
                
                if(index < numArticles) {
                    $article.show();
                } else {
                    $article.hide();
                    return;
                }

                refreshPostBlock($article, posts[index]);
                
            });
            
            // Если возвращено 0 статей, показать текст, что в данной категории нет статей и скрывать загрузки доп. статей. 
            // Иначе скрыть этот текст и показать кнопку.
            var $emptyPosts = $('.empty-posts');
            if(numArticles == 0) {
                $emptyPosts.show();
            } else {
                $emptyPosts.hide();
                
            }
            if(data.hasNext){
                $loadMoreBtn.show();
            } else {
                $loadMoreBtn.hide();
            }
            
            // обнуляем счетчик страниц на кнопке доп. загрузки
            $loadMoreBtn.attr('data-next-page', 2);
            
            //if (window.pluso)if (typeof window.pluso.start == "function") return;
            //if (window.ifpluso==undefined) { window.ifpluso = 1;
            //    var d = document, s = d.createElement('script'), g = 'getElementsByTagName';
            //    s.type = 'text/javascript'; s.charset='UTF-8'; s.async = true;
            //    s.src = ('https:' == window.location.protocol ? 'https' : 'http')  + '://share.pluso.ru/pluso-like.js';
            //    var h=d[g]('body')[0];
            //    h.appendChild(s);
            //};
        });

        

        // Для каждого возвращенного поста:
        // Меняем категорию

        // Время на прочтение

        // Заголовок

        // Тэги

        // Переинициализируем плюсы (пока не знаю как)

        // Переинициализируем кол-во комментов от DISQUS (тоже пока не знаю)




        // Удаляем класс .selected, для предыдущего выбранного элемента
        $(this).parents(".dropdown").find('dd a').each(function(){
            $(this).removeClass('selected');
        });

        // Обновляем текущую категорию
        $currentCategoryElem.html($(this).html());

        // Если выбран элемент по-умолчанию, удаляем у него класс .selected
        if($(this).hasClass('default')){
            $currentCategoryElem.removeClass('selected')
        }
        else{
            $currentCategoryElem.addClass('selected');
        }

        // Выделяем выбранный элемент списка
        $(this).addClass('selected');

        // Закрываем выпадающий список
        $(this).parents("ul").hide();

    });

// Close all dropdown onclick on another element
    $(document).bind('click', function(e){
        if (! $(e.target).parents().hasClass("dropdown")) $(".dropdown dd ul").hide();
    });
    
    // Дозагрузка постов
    $loadMoreBtn.click(function(){
        var $btn = $(this);
        // Если кнопка блокирована, ничего не делаем
        if($btn.attr('disabled')){
            return false;
        }
       // Блокируем кнопку
        $btn.attr('disabled', 'disabled');
        // получаем номер страницы и категорию, которые необходимо загрузить
        var $selectedItem = $dropdownContainer.find('ul .selected');
        var page = parseInt($btn.attr('data-next-page'));
        // Отправляем запрос
        var url = '/blogAjax?page=' + page;
        if(!$selectedItem.hasClass('default')){
            url = url + '&category=' + $selectedItem.text();
        }
        $.get(url, function(data){
            $.each(data.posts, function(index, post){
                // Для каждого возвращенного поста, клонируем соответствующий блок и заменяем данные
                var $post = $($feedContainer.find('> div').get(index)).clone();
                $feedContainer.append($post);
                
                refreshPostBlock($post, post);
                
            });
            // Если Больше постов нет, скрываем кнопку дозагрузки
            // Иначе сохраняем номер следующей страницы и активируем кнопку
            if(data.hasNext) {
                $btn.attr('data-next-page', page + 1);
                $btn.removeAttr('disabled');
            } else {
                $btn.hide();
            }
        });
        
        return false;
    });
    
});


