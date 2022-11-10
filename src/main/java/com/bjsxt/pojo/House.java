package com.bjsxt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class House implements Serializable {

    private  int  hId;
    private  String  hTitle;
    private  double  hPrice;
    private  int  hSell;
    private  String  hImage;
    private  int  hEstate;

}
