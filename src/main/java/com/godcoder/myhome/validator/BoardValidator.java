package com.godcoder.myhome.validator;


import com.godcoder.myhome.model.Board;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.thymeleaf.util.StringUtils;


//완강 하였습니다.
@Component
public class BoardValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Board.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        Board p = (Board) obj;
        if(StringUtils.isEmpty(p.getContent())){
            errors.rejectValue("content", "key", "내용을 입력하세요");
        }

    }
}
