package demo

import org.springframework.http.HttpStatus

class DemoController {

    //This causes the values in the map object to render as null in the GSON view.
    static responseFormats = ['json']

    def index() {
        respond([firstName: 'Jeff', submissionPackageId: 42l], status: HttpStatus.CREATED)
    }
}
