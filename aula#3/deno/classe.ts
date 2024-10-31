interface Compravel{
    vender(Proprietario:string):void;
    colocarAVenda():void;
};
interface Abastecivel{
    qtdLitros():number;
    abastecer(litros:number):void;
};

export type Carro = {
    nome:string;
    marca: string;
    ano: number;
};


export class Automovel implements Compravel, Abastecivel{
    public nome: string;
    public marca: string;
    public ano: number;
    public preco: number;
    public Proprietario:string;
    public litros: number;
    public aVenda:boolean = false;
    
    vender(Proprietario: string):void{
        console.log(`Vendido por ${Proprietario}`);
    };
    colocarAVenda():void{
        this.aVenda = true;
    }
    qtdLitros():number{
        return this.litros;
    };
    abastecer(litros:number):void{
        this.litros += litros;
    };
};

