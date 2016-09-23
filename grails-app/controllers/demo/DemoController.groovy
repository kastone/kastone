package demo

import org.springframework.http.HttpStatus

class DemoController {

    def index() {
        respond([firstName: 'Jeff', submissionPackageId: 42l], status: HttpStatus.CREATED)
    }
}
