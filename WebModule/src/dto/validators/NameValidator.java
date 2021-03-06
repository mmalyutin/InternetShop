package dto.validators;

import dto.category.CategoryConverter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * User: Dmitry
 * Date: 7/14/13
 * Time: 2:15 PM
 */
@FacesValidator(value = "NameValidator")
public class NameValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String name = (String) o;
        if (name.contains(CategoryConverter.SPLITTER)) {
            FacesMessage message = new FacesMessage("Name cannot contain " + CategoryConverter.SPLITTER);
            throw new ValidatorException(message);
        }
    }
}
