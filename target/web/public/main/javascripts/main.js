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

    var dropdowns = $(".dropdown");

    // Onclick on a dropdown, toggle visibility
    dropdowns.find("dt").click(function(){
        dropdowns.find("dd ul").hide();
        $(this).next().children().toggle();
    });

    // Click handler for dropdown
    dropdowns.find("dd ul li a").click(function(){
        var leSpan = $(this).parents(".dropdown").find("dt a span:first");

        // Remove selected class
        $(this).parents(".dropdown").find('dd a').each(function(){
            $(this).removeClass('selected');
        });

        // Update selected value
        leSpan.html($(this).html());

        // If back to default, remove selected class else addclass on right element
        if($(this).hasClass('default')){
            leSpan.removeClass('selected')
        }
        else{
            leSpan.addClass('selected');
            $(this).addClass('selected');
        }

        // Close dropdown
        $(this).parents("ul").hide();
    });

// Close all dropdown onclick on another element
    $(document).bind('click', function(e){
        if (! $(e.target).parents().hasClass("dropdown")) $(".dropdown dd ul").hide();
    });

});


