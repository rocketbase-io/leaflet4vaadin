// Copyright 2020 Gabor Kokeny and contributors
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//     http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.vaadin.addon.leaflet4vaadin.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Represents an icon to provide when creating a marker.
 * 
 * @author <strong>Gabor Kokeny</strong> Email:
 *         <a href='mailto=kokeny19@gmail.com'>kokeny19@gmail.com</a>
 * @since 2020-03-21
 * @version 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Icon implements BasicType {

    private static final long serialVersionUID = -5884170824139869060L;

    private static final String SHADOW_URL = "images/marker-shadow.png";

    public static Icon DEFAULT_ICON = new Icon("images/marker-icon.png", "images/marker-icon-2x.png", SHADOW_URL);

    private String iconUrl;
    private String retinaUrl;
    private String shadowUrl;
    private Point iconSize = Point.of(25, 41);
    private Point iconAnchor = Point.of(12, 41);
    private Point popupAnchor = Point.of(1, -34);
    private Point tooltipAnchor = Point.of(16, -28);
    private Point shadowSize = Point.of(41, 41);
    private Point shadowAnchor;
    private String className = "";

    protected Icon() {
    }

    public Icon(String iconUrl) {
        this(iconUrl, iconUrl, SHADOW_URL);
    }

    public Icon(String iconUrl, int size) {
        this(iconUrl, size, size);
    }

    public Icon(String iconUrl, int width, int height) {
        this(iconUrl, iconUrl, SHADOW_URL);
        setIconSize(Point.of(width, height));
        setIconAnchor(Point.of(width / 2, height / 2));
        setPopupAnchor(Point.of(1, -height / 2));
        setTooltipAnchor(Point.of(width / 2, 0));
        setShadowSize(Point.of(1, width));
    }

    public Icon(String iconUrl, String retinaUrl, String shadowUrl) {
        super();
        this.iconUrl = iconUrl;
        this.retinaUrl = retinaUrl;
        this.shadowUrl = shadowUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getRetinaUrl() {
        return retinaUrl;
    }

    public void setRetinaUrl(String retinaUrl) {
        this.retinaUrl = retinaUrl;
    }

    public String getShadowUrl() {
        return shadowUrl;
    }

    public void setShadowUrl(String shadowUrl) {
        this.shadowUrl = shadowUrl;
    }

    public Point getIconSize() {
        return iconSize;
    }

    public void setIconSize(Point iconSize) {
        this.iconSize = iconSize;
    }

    public Point getIconAnchor() {
        return iconAnchor;
    }

    public void setIconAnchor(Point iconAnchor) {
        this.iconAnchor = iconAnchor;
    }

    public Point getPopupAnchor() {
        return popupAnchor;
    }

    public void setPopupAnchor(Point popupAnchor) {
        this.popupAnchor = popupAnchor;
    }

    public Point getShadowAnchor() {
        return shadowAnchor;
    }

    public void setShadowAnchor(Point shadowAnchor) {
        this.shadowAnchor = shadowAnchor;
    }

    public Point getShadowSize() {
        return shadowSize;
    }

    public void setShadowSize(Point shadowSize) {
        this.shadowSize = shadowSize;
    }

    public Point getTooltipAnchor() {
        return tooltipAnchor;
    }

    public void setTooltipAnchor(Point tooltipAnchor) {
        this.tooltipAnchor = tooltipAnchor;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
