//package contracts
//
//import org.springframework.cloud.contract.spec.Contract
//
//Contract.make {
//    description "Should return a list of departments"
//
//    request {
//        url "/api/departments/v1"
//        method GET()
//    }
//
//    response {
//        status OK()
//        headers {
//            contentType applicationJson()
//        }
//        body([
//            [
//                "shortId": "dep1",
//                "name": "Department One"
//            ],
//            [
//                "shortId": "dep2",
//                "name": "Department Two"
//            ]
//        ])
//    }
//}
