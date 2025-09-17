import { check } from 'k6';
import http from 'k6/http';

export function setup() {
    console.log('This function runs only once regardless of the number of VUs or iterations.');
}

export default function () {
    const res = http.get('http://localhost:8080/hello');
    check(res, {
        'is status 200': (r) => r.status === 200,
    });
}
