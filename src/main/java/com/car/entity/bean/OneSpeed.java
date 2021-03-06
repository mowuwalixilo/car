package com.car.entity.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OneSpeed {
    private Integer id;
    private Integer channelId;
    private Integer speed;
}
