package com.example.tutorials.springboot.yodgorbekkomilov.service

import com.example.tutorials.springboot.yodgorbekkomilov.datasource.BankDataSource
import com.example.tutorials.springboot.yodgorbekkomilov.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {


    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)
    fun updateBank(bank: Bank): Bank = dataSource.updateBank(bank)

}