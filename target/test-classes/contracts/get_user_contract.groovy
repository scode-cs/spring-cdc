package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return a user detail of Id 1"

    request {
        url "/api/users/v1/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body([
                "id": "1",
                "name": "User One"
        ])
    }
}
