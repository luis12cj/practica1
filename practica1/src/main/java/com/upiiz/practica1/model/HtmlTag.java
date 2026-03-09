package com.upiiz.practica1.model;

public class HtmlTag {
    private String name;
    private String category;
    private String description;
    private String syntax;
    private String attributes;
    private String codeExample;

    // Constructor
    public HtmlTag(String name, String category, String description, String syntax, String attributes, String codeExample) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.syntax = syntax;
        this.attributes = attributes;
        this.codeExample = codeExample;
    }

    // Genera aquí los Getters y Setters para todos los atributos
    // (Puedes usar la función de IntelliJ: Alt + Insert -> Getter and Setter)

    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public String getSyntax() { return syntax; }
    public String getAttributes() { return attributes; }
    public String getCodeExample() { return codeExample; }
}