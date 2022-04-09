$(function () {
    $("#btn").click(function () {
        let num = $("#numero-input").val()
        $("#text").text("loading...")
        $.ajax({
            type:"get",
            url:`https://anapioficeandfire.com/api/characters/${num}`,
            dataType: "json",
            success: function (response) {
              $("#text").text("Success!!")
              $("#datos-nombre").text(response.name)
              $("#datos-genero").text(response.gender)
              $("#datos-titulo").text(response.titles[0])

              let arrayApodos = response.aliases
              let listaString =  '<ul>';
              for (let i = 0; i < arrayApodos.length; i++) {
                  listaString += `<li>${arrayApodos[i]}<br>`
              }
              $("#datos-apodo").html(listaString)
            },
            error: function (res) {
                console.log(res)
                $("#text").text("Error ese numero es invalido!! Error: "+ res.status)
                
            }
        })

    })

})