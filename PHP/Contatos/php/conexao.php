<?php

$host = "localhost";
$user = "root";
$pass = "";
$db = "contatos";

$conexao = mysqli_connect($host, $user, $pass, $db, "3306");

if (!$conexao) {
  echo "Erro: falha na conexao";
  exit;
}

echo "Sucesso: sucesso ao conectar-se com a base de dados do mysql";
