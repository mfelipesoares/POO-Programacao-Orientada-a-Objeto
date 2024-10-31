import { Automovel, Carro} from './classe.ts';

let carro = new Automovel;
carro.nome = "Uno";
carro.marca = "Fiat";
carro.ano = 2020;
carro.preco = 30000;
carro.Proprietario = "João";
carro.litros = 50;

console.log(carro);

carro.litros -= 35;
console.log(carro);

carro.abastecer(10);
console.log(carro);
