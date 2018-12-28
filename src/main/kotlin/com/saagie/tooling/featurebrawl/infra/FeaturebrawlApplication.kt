package com.saagie.tooling.featurebrawl.infra

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration

@SpringBootApplication(exclude = arrayOf(MongoAutoConfiguration::class))
class FeaturebrawlApplication


fun main(args: Array<String>) {
    SpringApplication.run(FeaturebrawlApplication::class.java, *args)
}
