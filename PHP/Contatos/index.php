<?php

$paginas = [
    "HOME" => "./php/home.php",
    "CONTATOS" => "./php/contato.php",
    "CADASTRO" => "./php/cadastro.php",
];

?>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./global.css">
    <title>HOME</title>
</head>

<body>

    <header>
        <nav>
            <?php
            foreach ($paginas as $pagina => $valor) {
                echo "<a class='link' href='?page=$pagina'>$pagina</a>";
            }

            ?>
        </nav>
    </header>



    <?php

    $page = "HOME";
    if (isset($_GET["page"])) {
        $page = array_key_exists($_GET["page"], $paginas) ? $_GET["page"] : "HOME";
    };

    require_once $paginas[$page];

    ?>




</body>

</html>