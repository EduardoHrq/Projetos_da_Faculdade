<?php

function add($conexao, $nome, $email, $tel)
{
  $sql = "INSERT INTO contatos(nome, email, tel) VALUES ('$nome', '$email', '$tel')";

  if (mysqli_query($conexao, $sql)) {
    header("Location: ../index.php?page=CONTATOS");

    echo "<script>alert('CONTATO CADASTRADO')</script>";
  } else {
    echo "erro";
  }
}

function listar($conexao)
{
  $sql = "SELECT * FROM contatos";
  $listaContatos = [];
  $resultado = mysqli_query($conexao, $sql);

  while ($contato = mysqli_fetch_assoc($resultado)) {
    array_push($listaContatos, $contato);
  }

  return $listaContatos;
}
