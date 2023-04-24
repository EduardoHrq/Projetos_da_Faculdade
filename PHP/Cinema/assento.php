<?php


if (isset($_GET['situacao']) and  isset($_GET['lugar'])) {
  $situacaoAssento = $_GET['situacao'];
  $lugar = $_GET['lugar'];
} else {
  $situacaoAssento = 'ERRO';
  $lugar = "ERRO";
}

?>

<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Assentos</title>
  <style>
    @import url('https://fonts.googleapis.com/css2?family=Inter:wght@500;800&display=swap');

    * {
      margin: 0;
      padding: 0;
      color: #000;
      font-family: 'Inter', sans-serif;
    }

    body {
      background-color: #262626;
      height: 100vh;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    #ticket {
      width: 360px;
      background: #fbbf24;
      border-top: 8px dashed #262626;
      border-bottom: 8px dashed #262626;
      position: relative;

    }

    .conteudo {
      text-align: center;
      border: 4px solid #000;
      border-radius: 12px;
      padding: 24px 12px;
      display: flex;
      flex-direction: column;
      gap: 12px;
      margin: 50px 25px;
    }

    .linha {
      width: 98%;
      height: 4px;
      border-radius: 9999px;
      background: #000;
    }

    .ball {
      width: 75px;
      height: 75px;
      border-radius: 50%;
      background-color: #262626;
      position: absolute;
    }

    .b1,
    .b2 {
      top: 0;
    }

    .b1 {
      transform: translateY(-50%) translateX(-50%);
    }

    .b2 {
      right: 0;
      transform: translateY(-50%) translateX(50%);
    }

    .b3 {
      transform: translateY(-50%) translateX(-50%);
    }

    .b4 {
      right: 0;
      transform: translateY(-50%) translateX(50%);
    }
  </style>
</head>

<body>

  <main>
    <div id="ticket">

      <div class="conteudo">

        <h1>Cinema</h1>

        <div class="linha"></div>

        <p>Número do assento</p>

        <h1>
          <?php
          echo $lugar;
          ?>
        </h1>

        <h3>
          <?php
          if ($situacaoAssento == 1) {
            echo "Este assento já está ocupado";
          } else if ($situacaoAssento == null) {
            echo "ERRO";
          } else {
            echo "Este assento esta vago";
          }

          ?>
        </h3>
      </div>


      <div class="ball b1"></div>
      <div class="ball b2"></div>
      <div class="ball b3"></div>
      <div class="ball b4"></div>

    </div>
  </main>

</body>

</html>