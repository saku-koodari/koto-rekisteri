/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package fi.oph.kitu.generated.api

import fi.oph.kitu.generated.model.YkiSuoritus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
interface YkiControllerApi {
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/yki"],
        produces = ["application/json"],
    )
    fun getSuoritus(): ResponseEntity<YkiSuoritus>
}
