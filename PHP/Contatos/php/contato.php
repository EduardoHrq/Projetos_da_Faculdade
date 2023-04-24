<?php

require_once "./php/conexao.php";
require_once  "./php/funcoes.php";

?>


<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Contatos</title>

  <script>
    window.document.title = "CONTATOS"
  </script>

  <style>
    main {
      display: flex;
      flex: 1;
      flex-direction: column;
      align-items: center;
      justify-content: flex-start;
      color: #fff;
    }

    h1 {
      margin: 25px 0 75px;
    }

    #content {
      display: flex;
      flex-direction: column;
      align-items: center;
      gap: 15px;
    }

    .box {
      width: 320px;
      padding: 25px;

      border-radius: 12px;

      background-color: #1e293b;
      letter-spacing: .1rem;
    }

    .box h2 {
      text-align: center;
      margin-bottom: 20px;
    }

    .infos {
      color: #cbd5e1;

      display: flex;
      flex-direction: column;
      gap: 12px;
    }

    #bar {
      width: 100%;
      height: 2px;
      background-color: #cbd5e1;
      opacity: .7;
      border-radius: 9999px;
    }
  </style>
</head>

<body>
  <main class="centro">
    <h1>Contatos</h1>
    <div id="content">
      <?php
      $contatos = listar($conexao);
      foreach ($contatos as $contato) {
      ?>
        <div class="box">
          <h2><?= $contato['nome'] ?></h2>
          <div class="infos">
            <div id="bar"></div>
            <p><strong>celular:</strong> <?= $contato['tel'] ?></p>
            <p><strong>e-mail:</strong> <?= $contato['email'] ?></p>
          </div>
        </div>
      <?php
      } ?>

    </div>
  </main>
</body>

</html>