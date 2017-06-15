package io.bootique.cayenne.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import io.bootique.cayenne.Article;

/**
 * Class _Domain was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Domain extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<String> VHOST = Property.create("vhost", String.class);
    public static final Property<List<Article>> ARTICLES = Property.create("articles", List.class);

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setVhost(String vhost) {
        writeProperty("vhost", vhost);
    }
    public String getVhost() {
        return (String)readProperty("vhost");
    }

    public void addToArticles(Article obj) {
        addToManyTarget("articles", obj, true);
    }
    public void removeFromArticles(Article obj) {
        removeToManyTarget("articles", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Article> getArticles() {
        return (List<Article>)readProperty("articles");
    }


}
