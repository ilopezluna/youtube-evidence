package com.ilopezluna.components;

import com.ilopezluna.utils.StringConstants;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.services.PersistentLocale;

import java.util.Locale;

public class LanguageForm {

    private static final String EN = "en";
    private static final String CAT = "cat";
    private static final String ES = "es";

    @Inject
    @Symbol(SymbolConstants.SUPPORTED_LOCALES)
    private String supportedLanguages;

    @Inject
    private PersistentLocale persistentLocale;

    @Inject
    @Property
    private Locale currentLocale;

    @Property
    private String langIter;

    public String[] getAvailableLanguages() {
        return supportedLanguages.split(StringConstants.COMMA);
    }

    public String getCurrentLanguage() {
        return (currentLocale != null) ? currentLocale.getLanguage() : EN;
    }

    public boolean isCurrent() {
        return langIter.equals(currentLocale.getLanguage());
    }

    void onActionFromCatLocaleLink() {
        persistentLocale.set(new Locale(CAT));
    }

    void onActionFromEsLocaleLink() {
        persistentLocale.set(new Locale(ES));
    }

    void onActionFromEnLocaleLink() {
        persistentLocale.set(Locale.ENGLISH);
    }
}
