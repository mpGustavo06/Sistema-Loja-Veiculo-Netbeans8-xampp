-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09-Dez-2022 às 02:24
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sysend`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carro`
--

CREATE TABLE `carro` (
  `codigo` int(5) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `ano` varchar(4) NOT NULL,
  `dataComp` varchar(10) NOT NULL,
  `placa` varchar(8) NOT NULL,
  `numVIN` varchar(20) NOT NULL,
  `cidade` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `carro`
--

INSERT INTO `carro` (`codigo`, `marca`, `modelo`, `ano`, `dataComp`, `placa`, `numVIN`, `cidade`, `estado`) VALUES
(4, 'Ford', 'Maverick', '1995', '15/06/2022', 'AFF6598', '656885125547', 'Maracujeira', 'Ceára'),
(5, 'Dodge', 'Dart', '1985', '15/06/2022', 'AGH6668', '66594216236', 'Maracujeira', 'Ceára');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `codigo` int(5) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `genero` varchar(20) NOT NULL,
  `dataNasc` varchar(10) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `cidade` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`codigo`, `nome`, `cpf`, `genero`, `dataNasc`, `endereco`, `cidade`, `estado`, `telefone`, `email`) VALUES
(7, 'Cleverson da Silva', '136.589.512-36', 'Masculino', '22/06/1990', 'Rua Barão do Rio Branco, 223', 'Cascavel', 'Paraná', '44 996584253', 'cleverson@gmail.com'),
(8, 'João Gonsalvez', '136.659.526-96', 'Masculino', '23/07/1991', 'Rua Juazeiro do Norte, 223', 'Porta Funda', 'Santa Catarina', '47 958621536', 'JoaoGonzz@gmail.com'),
(9, 'Cecilia Medeiros', '032.256.953-22', 'Feminino', '18/12/1999', 'Rua João do Pé Preto, 999', 'Laranjeiras', 'Paraná', '44 996584253', 'medeiros@gmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `compra`
--

CREATE TABLE `compra` (
  `codigo` int(5) NOT NULL,
  `dataComp` varchar(10) NOT NULL,
  `carros` text NOT NULL,
  `valorTotal` float NOT NULL,
  `metodoPag` varchar(15) NOT NULL,
  `func_codigo` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `compra`
--

INSERT INTO `compra` (`codigo`, `dataComp`, `carros`, `valorTotal`, `metodoPag`, `func_codigo`) VALUES
(18, '12/08/2022', 'Pontiac-TempestLeMans-1965, Pontiac-GTOTheJudge-1968, Pontiac-FirebirdTransAm-1979, ', 527485, 'Cartão', 12),
(19, '04/02/2000', 'Pontiac-GTOTheJudge-1968, ', 195305, 'Boleto', 13);

-- --------------------------------------------------------

--
-- Estrutura da tabela `distribuidora`
--

CREATE TABLE `distribuidora` (
  `codigo` int(5) NOT NULL,
  `empresa` varchar(100) NOT NULL,
  `cnpj` varchar(20) NOT NULL,
  `responsavel` varchar(100) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `cidade` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `distribuidora`
--

INSERT INTO `distribuidora` (`codigo`, `empresa`, `cnpj`, `responsavel`, `endereco`, `cidade`, `estado`, `telefone`, `email`) VALUES
(5, 'Importados Karmo', '02.256.156/0023-23', 'Matheus Madeiros Silva', 'Rua Golsalez, 224', 'São Paulo', 'São Paulo', '63 659852114', 'importadosKarmo@gmail.com'),
(6, 'CarsZ Imports', '03.655.945/0036-23', 'Matheus Madeiros Silva', 'Rua Golsalez, 224', 'São Paulo', 'São Paulo', '63 659852114', 'importadosKarmo@gmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `codigo` int(5) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `genero` varchar(15) NOT NULL,
  `cargo` varchar(20) NOT NULL,
  `dataNasc` varchar(10) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `cidade` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`codigo`, `nome`, `cpf`, `genero`, `cargo`, `dataNasc`, `endereco`, `cidade`, `estado`, `telefone`, `email`) VALUES
(11, 'Gabriel da Souza', '156.659.569-55', 'Masculino', 'Vendedor', '16/11/20', 'Avenida Palmeiras de São Pedro, 2212', 'Guarapuava', 'Paraná', '45 965669532', 'gabrielzin@gmail.com'),
(12, 'Jhonatan Souza', '156.659.569-55', 'Masculino', 'Comprador', '16/11/20', 'Avenida Palmeiras de São Pedro, 2212', 'Guarapuava', 'Paraná', '45 965669532', 'gabrielzin@gmail.com'),
(13, 'Maria do Karmo', '156.659.569-55', 'Feminino', 'Comprador', '16/11/20', 'Avenida Palmeiras de São Pedro, 2212', 'Guarapuava', 'Paraná', '45 965669532', 'gabrielzin@gmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `codigo` int(5) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `login` varchar(15) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `nivel` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`codigo`, `nome`, `login`, `senha`, `nivel`) VALUES
(12, 'Gustavo Matheus Pauvels', 'gg', 'gg', 'gerente'),
(16, 'Gabriel da Souza', 'gabriel', '123', 'Vendedor'),
(17, 'Jhonatan Souza', 'jhonatan', '123', 'Comprador'),
(18, 'Maria do Karmo', 'maria', '123', 'Comprador');

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

CREATE TABLE `venda` (
  `codigo` int(5) NOT NULL,
  `dataV` varchar(10) NOT NULL,
  `carros` varchar(100) NOT NULL,
  `valorTotal` float NOT NULL,
  `metodoPag` varchar(15) NOT NULL,
  `cliente_codigo` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `venda`
--

INSERT INTO `venda` (`codigo`, `dataV`, `carros`, `valorTotal`, `metodoPag`, `cliente_codigo`) VALUES
(29, '30/11/2000', 'Dodge-Dart', 259821, 'Dinheiro', 8),
(30, '23/08/2001', 'HarleyDavi', 64905, 'Boleto', 7);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `carro`
--
ALTER TABLE `carro`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `fk_compra_funcionario_idx` (`func_codigo`);

--
-- Índices para tabela `distribuidora`
--
ALTER TABLE `distribuidora`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices para tabela `venda`
--
ALTER TABLE `venda`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `fk_cliente_codigo_idx` (`cliente_codigo`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `carro`
--
ALTER TABLE `carro`
  MODIFY `codigo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `codigo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `compra`
--
ALTER TABLE `compra`
  MODIFY `codigo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de tabela `distribuidora`
--
ALTER TABLE `distribuidora`
  MODIFY `codigo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `codigo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codigo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de tabela `venda`
--
ALTER TABLE `venda`
  MODIFY `codigo` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `fk_compra_funcionario` FOREIGN KEY (`func_codigo`) REFERENCES `funcionario` (`codigo`);

--
-- Limitadores para a tabela `venda`
--
ALTER TABLE `venda`
  ADD CONSTRAINT `fk_cliente_codigo` FOREIGN KEY (`cliente_codigo`) REFERENCES `cliente` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
