package com.santiago.examplemvvm.domain

import com.santiago.examplemvvm.data.QuoteRepository
import com.santiago.examplemvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()
}