import { Component } from '@angular/core';


@Component({
    selector: 'courses',
    template: '<h2>{{ getTitle() }}</h2>'
})
export class CoursesComponent {
    private title = "List of courses";

    getTitle() {
        return this.title;
    }
}