package com.dominio.frete;

import com.constants.EFreteType;

public class FreteEXP extends BaseFrete{
    private final EFreteType type = EFreteType.EXP;
    private final double incrementalModifier = 10;
    private final double multiplicativeModifier = 1.5;
}
