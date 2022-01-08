function desktopEffect(){
  $('.menu-icon').on('click', function(){
    if(!$('.lateral-nav').hasClass('closed')){
      $('.lateral-nav').addClass('closed');
      $('.content').addClass('open');
    } else {
      $('.lateral-nav').removeClass('closed');
      $('.content').removeClass('open');
    }
  })
}

function moblieEffect(){
  $('.menu-icon').on('click', function(){
    if(!$('.lateral-nav').hasClass('open')){
      $('.lateral-nav').addClass('open');
      $('.content').addClass('open');
    } else {
      $('.lateral-nav').removeClass('open');
      $('.content').removeClass('open');
    }
  })
}

$(function(){

  desktopEffect();

});