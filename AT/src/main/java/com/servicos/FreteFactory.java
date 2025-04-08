package com.servicos;

import com.constants.EFreteType;
import com.dominio.frete.FreteECO;
import com.dominio.frete.FreteEXP;
import com.dominio.frete.FretePAD;
import com.dominio.frete.IFrete;
import com.dominio.frete.NullFrete;
;


public class FreteFactory {
    public static IFrete criarFrete(EFreteType type){
        switch (type) {
            case ECO:
                return new FreteECO();
            case EXP:
                return new FreteEXP();
            case PAD:
                return new FretePAD();
            default:
                return new NullFrete();
        }
    }
}
