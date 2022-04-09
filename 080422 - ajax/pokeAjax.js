$(document).ready(function() {
    let imagenes = ""
   for (let i = 1; i <= 150; i++) {
    imagenes +=  "<img class='click-me' id='"+i+"' src='https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/"+i+".png'>"
    };
$("#pokemones").html(imagenes)
});


$(function () {
    $("img").click(function (){
        let num = $(this).attr("id")
        let ruta = $(this).attr("src")
       
        $.ajax({
            type:"get",
            url:`https://pokeapi.co/api/v2/pokemon/${num}`,
            dataType: "json",
            success: function (response) {              
              $("#titulo").text(response.name)
              $("#foto").attr("src", ruta)

              let arrayTipo = response.types
              let listaString =  '<ul>';
              for (let i = 0; i < arrayTipo.length; i++) {
                  listaString += `<li>${arrayTipo[i]}<br>`
              }
              
              $("#tipos").html(listaString)
              console.log(listaString)


              let height = response.height / 10
              let weight = response.weight / 10
              $("#altura").text(height + " m")
              $("#peso").text(weight + " kg")

              
            },
        })
    })
    })


    jQuery(document).ready(function() {
        jQuery('.click-me').click(function(e) {
            e.preventDefault();
    
            var target = jQuery("#titulo");
            if (target.length) {
                jQuery('html,body').animate({
                        scrollTop: target.offset().top
                    }, 500, function(){ // function to focus here
                       jQuery("#titulo").focus();
                 });
                 return false;
             }
         });
    });