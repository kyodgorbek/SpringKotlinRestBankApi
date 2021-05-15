package com.example.tutorials.springboot.yodgorbekkomilov.service


import com.example.tutorials.springboot.yodgorbekkomilov.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private var dataSource: BankDataSource = mockk(relaxed = true)

    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // given

        // when

         bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }


    }


}