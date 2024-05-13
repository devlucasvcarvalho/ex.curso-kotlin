  fun main() {
      // Classificar faixa etária
      //idoso 60+ anos
      var idade:Int =4
      if (idade>=200){
          println("call the cops, its a vampire!!")
      }else if(idade<=60 && idade>=180){
          println("velho")
      }else if(idade<=59 && idade>=20){
          println("adulto")
      }else if(idade<=19 && idade>=13){
          println("Jovem")
      }else if(idade<=12 && idade>=3){
          println("criança")
      }else if(idade<=2 && idade>=0){
          println("baby")
      }else{
          println("idade inválida")
      }
  }