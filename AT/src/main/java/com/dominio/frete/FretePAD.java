package com.dominio.frete;

import com.constants.EFreteType;

public class FretePAD extends BaseFrete {
    private final EFreteType type = EFreteType.PAD;
    private final double incrementalModifier = 0;
    private final double multiplicativeModifier = 1.2;
}
