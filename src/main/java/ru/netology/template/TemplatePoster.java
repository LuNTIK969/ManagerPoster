package ru.netology.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TemplatePoster {
    private int id;
    private String filmName;
    private String genre;
    private int date;

}
