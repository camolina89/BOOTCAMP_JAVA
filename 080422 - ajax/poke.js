$(function () {
    for (let i = 1; i < 37; i++) {
        $("#imagenes-poke").append(`<img style="cursor:pointer; margin:0 5px; border:2px #dfdfdf solid;border-radius:5px" id="${i}" src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${i}.png">`)
    }
    $("img").click(function(){
        let num = this.id
        $.ajax({
            type: "get",
            url: `https://pokeapi.co/api/v2/pokemon/${num}`,
            dataType: "json",
            success: function (res) {
                $("#nombre-uno").text(res.name.charAt(0).toUpperCase()+res.name.slice(1))
                $("#stats-poke").css("display", "inline-block")
                $("#imagen-un-pokemon").attr("src",`${res.sprites.front_shiny}`)
                let listaTipos="<ul>";
                    for (let i = 0; i < res.types.length; i++) {
                    listaTipos+= `<li>${res.types[i].type.name} <br>`
                    if(res.types.lenght-1 == i){
                        listaTipos+="</ul>"
                    }
                }
                $('#type-uno').html(listaTipos)
                $('#height-uno').text(res.height)
                $('#weight-uno').text(res.weight)
            }
        });
    })
})