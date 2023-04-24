<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cadastro</title>


  <script>
    window.document.title = "CADASTRO"
  </script>


  <style>
    .centro {
      height: 100%;
      display: flex;
      flex: 1;
      align-items: center;
      justify-content: center;
    }

    h1 {
      text-align: center;
      color: #e2e8f0;
      margin-bottom: 75px;
    }

    form {
      width: 320px;

      display: flex;
      flex-direction: column;
      gap: 20px;
    }

    .box {
      width: 100%;
      display: flex;

      background-color: #1e293b;
      border-radius: 10px 10px 0 0;
      position: relative;
    }

    .space {
      margin: 25px 0;
    }

    label {
      color: #64748b;

      position: absolute;
      transform: translateY(-50%);
      top: 50%;
      left: 12px;

      transition: all 300ms;
    }

    input {
      width: 100%;

      border: none;
      outline: none;
      background-color: transparent;
      box-shadow: inset 0 -4px 0 0 #6366f1;

      padding: 12px;

      color: #e2e8f0;
    }

    .btts {
      width: 100%;
      display: flex;
      gap: 12px;
    }

    button {
      flex: 1;

      border: none;
      outline: none;
      padding: 12px;
      border-radius: 8px;
      font-weight: bold;
      color: #fff;
    }

    .reset {
      background-color: #ef4444;
    }

    .confirm {
      background-color: #6366f1;
    }
  </style>

</head>

<body>
  <main class="centro">
    <div id="container">
      <h1>CADASTRO</h1>

      <form action="./php/addContato.php" method="post">

        <div class="box">
          <input oninput="subir(event)" type="text" name="nome" id="nome" autocomplete="FALSE" required>
          <label for="nome" id="nomeL">NOME</label>
        </div>

        <div class="box space">
          <input oninput="subir(event)" type="email" name="email" id="email" autocomplete="FALSE" required>
          <label for="email" id="emailL">E-MAIL</label>
        </div>

        <div class="box">
          <input oninput="subir(event)" type="text" name="tel" id="tel" autocomplete="FALSE" required>
          <label for="tel" id="telL">TELEFONE</label>
        </div>

        <div class="btts">
          <button class="reset" type="reset">Limpar</button>
          <button class="confirm" type="submit">Salvar</button>
        </div>

      </form>
    </div>
  </main>

  <script src="https://unpkg.com/imask"></script>

  <script>
    let telefone = document.getElementById("tel")
    IMask(telefone, {
      mask: '{(}00{)} 0 0000 - 0000'
    })

    function subir(event) {
      let elementId = event.target.id;

      console.log(elementId)

      let elemento = document.getElementById(elementId)
      let texto = document.getElementById(elementId + "L")

      if (elemento.value.length > 0) {
        texto.style.top = "-15px";
        texto.style.left = "0";
        texto.style.color = "#e2e8f0";

      } else {
        texto.style.top = "50%";
        texto.style.left = "12px";
        texto.style.color = "#64748b";

      }
    }
  </script>


</body>

</html>