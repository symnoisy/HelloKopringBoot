package com.hellokopringboot.demo.model

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Document(collection="yahoo_finance_chart")
@Entity
class ResponseDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: String? = null

    @Field(name="created_date_time")
    var createdDatetime: LocalDateTime = LocalDateTime.now()

//    @Field(name="response_data")
//    lateinit var response_data: ResponseDataDto = mutableMapOf<>()
}
