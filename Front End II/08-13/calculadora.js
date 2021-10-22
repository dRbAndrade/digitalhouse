
let calculadora = {
    somar:function (...n){return n.reduce((acc,e)=>acc+e)},
    subtrair:function (...n){return n.reduce((acc,e)=>acc-e)},
    multiplicar:function (...n){return n.reduce((acc,e)=>acc*e)},
    dividir:function (...n){
        if(n.indexOf(0)!=-1)return "Não é possível divir por zero";
        return n.reduce((acc,e)=>acc/e);
    },
}

export default calculadora;