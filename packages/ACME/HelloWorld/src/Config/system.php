<?php

return [
    [
        'key' => 'helloworld',
        'name' => 'Hello World',
        'sort' => 1
    ], [
        'key' => 'helloworld.settings',
        'name' => 'Custom Settings',
        'sort' => 1,
    ], [
        'key' => 'helloworld.settings.settings',
        'name' => 'Custom Groupings',
        'sort' => 1,
        'fields' => [
            [
                'name' => 'status',
                'title' => 'Status',
                'type' => 'boolean',
                'channel_based' => true,
                'locale_based' => false
            ]
        ]
    ]
];
