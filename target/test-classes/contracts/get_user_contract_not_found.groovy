package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return 404 for Id 10"

    request {
        url "/api/users/v1/10"
        method GET()
    }

    response {
        status NOT_FOUND()
    }
}
