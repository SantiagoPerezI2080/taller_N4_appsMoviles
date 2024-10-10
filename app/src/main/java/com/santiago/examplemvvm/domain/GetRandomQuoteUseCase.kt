package com.santiago.examplemvvm.domain

import com.santiago.examplemvvm.data.model.QuoteModel
import com.santiago.examplemvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke():QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (0..quotes.size-1).random()
            return quotes[randomNumber]
        }
        return null
    }
}