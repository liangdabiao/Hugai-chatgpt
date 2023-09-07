package com.hugai.common.enums.flow;

import com.org.bebas.core.flowenum.base.FlowBaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 绘图类型
 *
 * @author WuHao
 * @since 2023/6/19 10:08
 */
@Getter
@AllArgsConstructor
public enum DrawType implements FlowBaseEnum {

    OPENAI("OPENAI", "openAi接口"),

    SD("SD", "stable diffusion")
    ;

    private final String key;

    private final String value;

}
