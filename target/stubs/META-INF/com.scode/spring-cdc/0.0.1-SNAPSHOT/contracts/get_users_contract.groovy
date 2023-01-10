package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return a list of users"

    request {
        url "/api/users/v1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body([
            [
                "id": "1",
                "name": "User One"
            ],
            [
                "id": "2",
                "name": "User Two"
            ]
        ])
    }
}
