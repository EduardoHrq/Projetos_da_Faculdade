<?php

require_once "./conexao.php";
require_once "./funcoes.php";

$nome = $_POST['nome'];
$email = $_POST['email'];
$tel = $_POST['tel'];

// echo $nome, $email, $tel;

add($conexao, $nome, $email, $tel);
