package com.upiiz.practica1.service;

import com.upiiz.practica1.model.HtmlTag;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TagService {

    private final List<HtmlTag> tags = new ArrayList<>();

    public TagService() {
        // --- CATEGORÍA: ESTRUCTURA ---
        tags.add(new HtmlTag("html", "Estructura",
                "Es el elemento raíz (root) de un documento HTML. Todos los demás elementos deben estar dentro de él.",
                "<html>...</html>", "lang, xmlns",
                "<html lang=\"es\">\n  <head>\n    <title>Ejemplo</title>\n  </head>\n  <body>\n    <p>Hola</p>\n  </body>\n</html>"));

        tags.add(new HtmlTag("head", "Estructura",
                "Contiene metadatos sobre el documento, como su título, enlaces a hojas de estilo (CSS) y scripts.",
                "<head>...</head>", "Ninguno específico",
                "<head>\n  <meta charset=\"UTF-8\">\n  <title>Mi Página Web</title>\n</head>"));

        tags.add(new HtmlTag("body", "Estructura",
                "Representa el contenido principal de un documento HTML. Todo lo visible en la página web va aquí.",
                "<body>...</body>", "class, id",
                "<body style=\"background-color: #f8f9fa;\">\n  <p>Este es el contenido visible.</p>\n</body>"));

        // --- CATEGORÍA: TEXTO ---
        tags.add(new HtmlTag("p", "Texto",
                "Define un párrafo de texto normal.",
                "<p>...</p>", "class, id, style",
                "<p>Este es un párrafo de ejemplo en Spring Boot.</p>"));

        tags.add(new HtmlTag("h1", "Texto",
                "Define el encabezado más importante de la página.",
                "<h1>...</h1>", "class, id",
                "<h1>Título Principal de la Página</h1>"));

        tags.add(new HtmlTag("h2", "Texto",
                "Define un subtítulo de segundo nivel de importancia.",
                "<h2>...</h2>", "class, id",
                "<h2>Subtítulo de la sección</h2>"));

        tags.add(new HtmlTag("h3", "Texto",
                "Define un subtítulo de tercer nivel, útil para subsecciones.",
                "<h3>...</h3>", "class, id",
                "<h3>Detalles de la subsección</h3>"));

        tags.add(new HtmlTag("span", "Texto",
                "Contenedor en línea (inline) genérico. Se usa para aplicar estilos a una parte del texto.",
                "<span>...</span>", "class, id, style",
                "Texto normal, pero <span style=\"color: red; font-weight: bold;\">esto resalta en rojo</span>."));

        tags.add(new HtmlTag("strong", "Texto",
                "Indica que su contenido tiene gran importancia. Los navegadores lo muestran en negrita.",
                "<strong>...</strong>", "class, id",
                "Precaución: <strong>No compartas tu contraseña.</strong>"));

        tags.add(new HtmlTag("em", "Texto",
                "Representa un texto con énfasis semántico. Normalmente se muestra en cursiva.",
                "<em>...</em>", "class, id",
                "Yo <em>realmente</em> necesito aprobar esta práctica."));

        // --- CATEGORÍA: ENLACES E IMÁGENES ---
        tags.add(new HtmlTag("a", "Enlaces e imágenes",
                "Define un hipervínculo para enlazar de una página a otra.",
                "<a href=\"url\">...</a>", "href, target, rel",
                "<a href=\"https://spring.io\" target=\"_blank\">Ir a Spring Boot</a>"));

        tags.add(new HtmlTag("img", "Enlaces e imágenes",
                "Se usa para insertar una imagen. Es una etiqueta vacía (no tiene cierre).",
                "<img src=\"url\" alt=\"texto alternativo\">", "src, alt, width, height",
                "<img src=\"https://www.w3schools.com/images/w3schools_green.jpg\" alt=\"Logo\" width=\"100\">"));

        // --- CATEGORÍA: LISTAS ---
        tags.add(new HtmlTag("ul", "Listas",
                "Define una lista desordenada, típicamente mostrada con viñetas (puntos).",
                "<ul>...</ul>", "class, id",
                "<ul>\n  <li>Manzanas</li>\n  <li>Plátanos</li>\n</ul>"));

        tags.add(new HtmlTag("ol", "Listas",
                "Define una lista ordenada, típicamente mostrada con números.",
                "<ol>...</ol>", "type, start",
                "<ol>\n  <li>Primer paso</li>\n  <li>Segundo paso</li>\n</ol>"));

        tags.add(new HtmlTag("li", "Listas",
                "Define un elemento de lista. Debe ir siempre dentro de un <ul> o un <ol>.",
                "<li>...</li>", "value",
                "<ul>\n  <li>Soy un elemento de lista.</li>\n</ul>"));

        // --- CATEGORÍA: TABLAS ---
        tags.add(new HtmlTag("table", "Tablas",
                "Define una tabla para mostrar datos de forma tabular (filas y columnas).",
                "<table>...</table>", "border, class",
                "<table border=\"1\" cellpadding=\"5\">\n  <tr><th>Mes</th><th>Ahorro</th></tr>\n  <tr><td>Enero</td><td>$100</td></tr>\n</table>"));

        tags.add(new HtmlTag("tr", "Tablas",
                "Define una fila (table row) dentro de una tabla.",
                "<tr>...</tr>", "class, id",
                "<table border=\"1\">\n  <tr><td>Celda 1</td><td>Celda 2</td></tr>\n</table>"));

        tags.add(new HtmlTag("td", "Tablas",
                "Define una celda de datos estándar (table data) en una tabla HTML.",
                "<td>...</td>", "colspan, rowspan",
                "<table border=\"1\">\n  <tr><td>Dato A</td><td>Dato B</td></tr>\n</table>"));

        tags.add(new HtmlTag("th", "Tablas",
                "Define una celda de encabezado (table header). El texto suele mostrarse en negrita y centrado.",
                "<th>...</th>", "colspan, rowspan, scope",
                "<table border=\"1\">\n  <tr><th>Nombre</th><th>Edad</th></tr>\n</table>"));

        // --- CATEGORÍA: FORMULARIOS ---
        tags.add(new HtmlTag("form", "Formularios",
                "Crea un formulario HTML para la entrada del usuario.",
                "<form action=\"...\">...</form>", "action, method, enctype",
                "<form action=\"#\">\n  <input type=\"text\" placeholder=\"Búsqueda...\">\n  <button type=\"submit\">Buscar</button>\n</form>"));

        tags.add(new HtmlTag("input", "Formularios",
                "El elemento de formulario más utilizado. Puede ser texto, contraseña, checkbox, etc.",
                "<input type=\"...\">", "type, name, value, placeholder, required",
                "<input type=\"checkbox\" id=\"check1\"> <label for=\"check1\">Acepto</label>"));

        tags.add(new HtmlTag("label", "Formularios",
                "Define una etiqueta para un elemento de formulario. Mejora la accesibilidad.",
                "<label for=\"id_del_input\">...</label>", "for",
                "<label for=\"user\">Usuario:</label>\n<input type=\"text\" id=\"user\" name=\"user\">"));

        tags.add(new HtmlTag("button", "Formularios",
                "Define un botón que el usuario puede presionar.",
                "<button>...</button>", "type, disabled",
                "<button type=\"button\" onclick=\"alert('¡Hola!')\">Haz clic aquí</button>"));

        tags.add(new HtmlTag("select", "Formularios",
                "Crea una lista desplegable. Contiene elementos <option>.",
                "<select>...</select>", "name, id, multiple",
                "<select name=\"opciones\">\n  <option value=\"1\">Opción 1</option>\n  <option value=\"2\">Opción 2</option>\n</select>"));

        // --- CATEGORÍA: MULTIMEDIA ---
        tags.add(new HtmlTag("audio", "Multimedia",
                "Incrusta contenido de sonido en documentos, como música.",
                "<audio controls>...</audio>", "src, controls, autoplay",
                "<audio controls>\n  <source src=\"https://www.w3schools.com/html/horse.ogg\" type=\"audio/ogg\">\n</audio>"));

        tags.add(new HtmlTag("video", "Multimedia",
                "Se utiliza para mostrar un video en una página web.",
                "<video controls>...</video>", "src, controls, width, height",
                "<video width=\"200\" controls>\n  <source src=\"https://www.w3schools.com/html/movie.mp4\" type=\"video/mp4\">\n</video>"));

        // --- CATEGORÍA: SEMÁNTICAS ---
        tags.add(new HtmlTag("header", "Semánticas",
                "Representa un grupo de contenido introductorio o de navegación.",
                "<header>...</header>", "class, id",
                "<header style=\"background-color:#212529; color:white; padding:10px;\">\n  <h2>Mi Portafolio Web</h2>\n</header>"));

        tags.add(new HtmlTag("footer", "Semánticas",
                "Define un pie de página. Suele contener información de autoría o derechos de autor.",
                "<footer>...</footer>", "class, id",
                "<footer style=\"background-color:#e9ecef; padding:10px; margin-top:10px;\">\n  <p>© 2026 Todos los derechos reservados.</p>\n</footer>"));

        tags.add(new HtmlTag("section", "Semánticas",
                "Define una sección genérica en un documento. Suele tener un encabezado.",
                "<section>...</section>", "class, id",
                "<section>\n  <h3>Sección de Noticias</h3>\n  <p>Aquí van las noticias...</p>\n</section>"));

        tags.add(new HtmlTag("article", "Semánticas",
                "Especifica contenido independiente que podría distribuirse por sí solo (ej. un post de blog).",
                "<article>...</article>", "class, id",
                "<article style=\"border: 1px solid #ccc; padding: 10px;\">\n  <h3>Aprender Java</h3>\n  <p>Java es genial para backend.</p>\n</article>"));

        tags.add(new HtmlTag("nav", "Semánticas",
                "Define una sección del documento que contiene enlaces de navegación importantes.",
                "<nav>...</nav>", "class, id",
                "<nav style=\"background-color:#0d6efd; padding:10px;\">\n  <a href=\"#\" style=\"color:white; margin-right:15px;\">Inicio</a>\n  <a href=\"#\" style=\"color:white;\">Contacto</a>\n</nav>"));
    }

    public Map<String, List<HtmlTag>> getTagsByCategory() {
        return tags.stream().collect(Collectors.groupingBy(HtmlTag::getCategory));
    }

    public HtmlTag getTagByName(String name) {
        return tags.stream()
                .filter(t -> t.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public HtmlTag getPreviousTag(String currentName) {
        for (int i = 0; i < tags.size(); i++) {
            if (tags.get(i).getName().equalsIgnoreCase(currentName)) {
                return (i > 0) ? tags.get(i - 1) : tags.get(tags.size() - 1);
            }
        }
        return null;
    }

    public HtmlTag getNextTag(String currentName) {
        for (int i = 0; i < tags.size(); i++) {
            if (tags.get(i).getName().equalsIgnoreCase(currentName)) {
                return (i < tags.size() - 1) ? tags.get(i + 1) : tags.get(0);
            }
        }
        return null;
    }
}