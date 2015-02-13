$(document).ready(function(){
    $('#layerslider').layerSlider({
        skinsPath : 'images/skins/',
        globalBGColor : '#333',
        skin : 'defaultskin',
        autoStart: false,
        pauseOnHover : 'false'
    });

    $(".dg-feed__btn" ).hover(function(e){
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

    var $dropdownContainer = $(".dropdown");
    var $currentCategoryElem = $dropdownContainer.find('.dg-feed_filter__section__content');

    // Контейнер для блоков статей
    var $feedContainer = $('.dg-feed__content');
    
    // Onclick on a dropdown, toggle visibility
    $dropdownContainer.find("dt").click(function(){
        $dropdownContainer.find("dd ul").hide();
        $(this).next().children().toggle();
    });

    // Нажатие на категорию из выпадающего списка
    $dropdownContainer.find("dd ul li a").click(function(){
        var $this = $(this);

        // проверка, выбрана текущая категория или другая
        // Если текущцая, ничего не делаем, иначе продолжаем
        var $selectedCategoryElem = $this;
        if($selectedCategoryElem.hasClass('selected')) return;

        // Называние выбранной категории
        var selectedCategory = $selectedCategoryElem.text();

        // Отправить запрос на получение данных
        var url = '/blogAjax?category=' + selectedCategory;
        $.get(url, function(data) {
            console.log(data);
            // В зависимости от кол-ва возвращенных статей, скрыть лишние блоки.
            // Если вернулось 0 статей, отобразить сообщение что в данной категории нет статей.
            
            // Получаем кол-во возвращенных статей
            var numArticles = data.length;
            
            // делаем видимыми кол-во блоков == кол-во полученных статей
            // остальные скрываем
            $feedContainer.find('> div').each(function(index, article){
                var $article = $(article);
                if(index < numArticles) {
                    $article.show();
                } else {
                    $article.hide();
                    return;
                }
                // Меняем категорию
                $article.find('.dg-feed__info__util__sector').text(data[index].category);
                // Ссылку
                $article.find('.dg-feed__image').attr('href', '/' + data[index].id + '/' + data[index].slug);
                // Картинку
                $article.find('.dg-feed__image').css('background-image', 'url(' + data[index].thumbUrl + ')');
                // Время на прочтение
                $article.find('.dg-feed__info__util__time').text(data[index].minToRead + ' мин');
                // Заголовок
                $article.find('.dg-feed__info__header h2').text(data[index].title);
                // Тэги
                var $newTagList = $('<ul></ul>');
                $(data[index].tags).each(function(index, tag){
                    $newTagList.append('<li>#' + tag + '</li>');
                });
                $article.find('.dg-feed__info__tags').empty().append($newTagList);
                // Переинициализируем плюсы (пока не знаю как)
                $article.find('.dg-feed__info__actions').hide();
                // Переинициализируем кол-во комментов от DISQUS (тоже пока не знаю)
                
            });


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

});


