package com.djamware.myspringbootapp.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class MyProduct implements Serializable {
    @Id
    private Integer id;

    private String prodName;

    private String prodDesc;

    private Double prodPrice;
}
