package com.mustafa.stockmanagement.productservice.exception.exceptions;

import com.mustafa.stockmanagement.productservice.enums.Language;
import com.mustafa.stockmanagement.productservice.exception.enums.IFriendlyMessageCode;
import com.mustafa.stockmanagement.productservice.exception.utils.FriendlyMessageUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class ProductNotFoundException extends RuntimeException {
    private final Language language;
    private final IFriendlyMessageCode friendlyMessageCode;

    public ProductNotFoundException(Language language, IFriendlyMessageCode friendlyMessageCode,String message) {
        super(FriendlyMessageUtils.getFriendlyMessage(language,friendlyMessageCode));
        this.language = language;
        this.friendlyMessageCode = friendlyMessageCode;
        log.error("[ProductNotFound]-> message:{} developer message: {}",FriendlyMessageUtils.getFriendlyMessage(language,friendlyMessageCode),message);
    }
}