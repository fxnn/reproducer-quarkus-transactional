package de.fxnn;

import javax.transaction.Transactional;

@Transactional
public class ExampleResource extends AbstractResource<ExampleDto> implements ExampleApi {}
