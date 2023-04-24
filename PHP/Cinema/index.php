<?php

$vagas = [

  [0, 1, 1, 0, 0, 0, 1, 1, 1, 1,],
  [0, 1, 1, 0, 1, 0, 1, 0, 0, 1,],
  [0, 1, 0, 1, 0, 1, 0, 1, 1, 1,],
  [0, 1, 1, 1, 0, 1, 1, 1, 1, 1,],
  [0, 1, 1, 0, 0, 0, 1, 1, 0, 0,],
  [0, 1, 1, 0, 1, 1, 1, 1, 0, 1,],
  [0, 1, 1, 0, 1, 0, 1, 1, 1, 1,]

];


?>


<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cinema</title>
  <style>
    @import url('https://fonts.googleapis.com/css2?family=Inter:wght@500;800&display=swap');

    * {
      margin: 0;
      padding: 0;
      color: white;
      font-family: 'Inter', sans-serif;
    }

    body {
      background-color: #262626;
      padding: 4px;
    }

    #tela {
      width: 75%;
      margin: auto;
      border-left: 75px solid transparent;
      border-right: 75px solid transparent;
      border-top: 100px solid #000;
      display: flex;
      align-items: center;
      justify-content: center;
      position: relative;
    }

    #tela div {
      color: #fff;
      position: absolute;
      top: 50%;
      transform: translateY(-250%);
      line-height: 1;
      font-size: 16pt;
      font-weight: bold;
    }

    table {
      margin: 20px auto;
      border-collapse: collapse;
      border-radius: 12px;
      overflow: hidden;
      font-size: 14pt;
    }

    tbody tr:nth-of-type(odd) {
      background: #171717;
    }

    tr,
    th,
    td {
      padding: 12px;

    }

    .assentoLetra {
      padding-right: 25px;
    }

    .assentoNum {
      padding-bottom: 20px;
    }

    button {
      outline: none;
      border: none;
      border-radius: 12px;
      padding: 4px;
      background: #fff;
      transition: .15s;
      cursor: pointer;
    }

    button:hover {
      transform: scale(125%);
    }

    .btvaga {
      box-shadow: 0 0 0 5px #0ea5e9;
    }

    .btocupado {
      box-shadow: 0 0 0 5px #71717a;
    }

    img {
      width: 75px;
      display: block;
      margin: auto;
      border-radius: 12px;
    }
  </style>
</head>

<body>
  <main>


    <div id="tela">
      <div>
        Tela
      </div>
    </div>

    <div id="cadeiras">
      <table>
        <thead>
          <tr>
            <th class="assentoNum"></th>
            <th class="assentoNum">1</th>
            <th class="assentoNum">2</th>
            <th class="assentoNum">3</th>
            <th class="assentoNum">4</th>
            <th class="assentoNum">5</th>
            <th class="assentoNum">6</th>
            <th class="assentoNum">7</th>
            <th class="assentoNum">8</th>
            <th class="assentoNum">9</th>
            <th class="assentoNum">10</th>
          </tr>
        </thead>

        <tbody>
          <?php
          $i = 0;
          foreach ($vagas as $lugar) {
            $letra = "A";
            echo "<tr>";
            switch ($i) {
              case 0:
                echo "<th class='assentoLetra'>A</th>";
                $letra = "A";
                break;
              case 1:
                echo "<th class='assentoLetra'>B</th>";
                $letra = "B";
                break;
              case 2:
                echo "<th class='assentoLetra'>C</th>";
                $letra = "C";
                break;
              case 3:
                echo "<th class='assentoLetra'>D</th>";
                $letra = "D";
                break;
              case 4:
                echo "<th class='assentoLetra'>E</th>";
                $letra = "E";
                break;
              case 5:
                echo "<th class='assentoLetra'>F</th>";
                $letra = "F";
                break;
              case 6:
                echo "<th class='assentoLetra'>G</th>";
                $letra = "G";
                break;
            }
            $cont = 1;
            foreach ($lugar as $vaga) {

              if (!strcmp($vaga, 1)) {
                echo "<td>";
                echo "<form action='assento.php' method='get'>
              
                <input type='hidden' value=$letra$cont name='lugar' />
                <input type='hidden' value=$vaga name='situacao' />
              
                ";
                echo "
                <button type='submit' class='btocupado'>
                <img src='./src/cadeiraOcupada.png' />
                </button>
                ";
                echo "</form>";

                echo "</td>";
              } else {
                echo "<td>";
                echo "<form action='assento.php' method='get'>
              
                <input type='hidden' value=$letra$cont name='lugar' />
                <input type='hidden' value=$vaga name='situacao' />
              
                ";
                echo "
                <button type='submit' class='btvaga'>
                <img src='./src/cadeiraVaga.png' />
                </button>
                ";
                echo "</form>";

                echo "</td>";
              }
              $cont++;
            }

            echo "</tr>";
            $i++;
          }
          ?>

        </tbody>



      </table>


    </div>

  </main>
</body>

</html>