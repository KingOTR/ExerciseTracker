package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import org.osmdroid.util.RectL;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.OverlayItem;

/* loaded from: classes5.dex */
public abstract class ItemizedOverlay<Item extends OverlayItem> extends Overlay implements Overlay.Snappable {
    private Rect itemRect;
    private final Point mCurScreenCoords;
    protected final Drawable mDefaultMarker;
    protected boolean mDrawFocusedItem;
    protected int mDrawnItemsLimit;
    private Item mFocusedItem;
    private boolean[] mInternalItemDisplayedList;
    private final ArrayList<Item> mInternalItemList;
    private final Rect mMarkerRect;
    private OnFocusChangeListener mOnFocusChangeListener;
    private final Rect mOrientedMarkerRect;
    private boolean mPendingFocusChangedEvent;
    private final Rect mRect;
    private Rect screenRect;

    public interface OnFocusChangeListener {
        void onFocusChanged(ItemizedOverlay<?> itemizedOverlay, OverlayItem overlayItem);
    }

    protected abstract Item createItem(int i);

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
    }

    protected boolean onTap(int i) {
        return false;
    }

    public abstract int size();

    @Deprecated
    public ItemizedOverlay(Context context, Drawable drawable) {
        this(drawable);
    }

    public ItemizedOverlay(Drawable drawable) {
        this.mDrawnItemsLimit = Integer.MAX_VALUE;
        this.mRect = new Rect();
        this.mMarkerRect = new Rect();
        this.mOrientedMarkerRect = new Rect();
        this.mCurScreenCoords = new Point();
        this.mDrawFocusedItem = true;
        this.mPendingFocusChangedEvent = false;
        this.itemRect = new Rect();
        this.screenRect = new Rect();
        if (drawable == null) {
            throw new IllegalArgumentException("You must pass a default marker to ItemizedOverlay.");
        }
        this.mDefaultMarker = drawable;
        this.mInternalItemList = new ArrayList<>();
    }

    public int getDrawnItemsLimit() {
        return this.mDrawnItemsLimit;
    }

    public void setDrawnItemsLimit(int i) {
        this.mDrawnItemsLimit = i;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        OnFocusChangeListener onFocusChangeListener;
        if (this.mPendingFocusChangedEvent && (onFocusChangeListener = this.mOnFocusChangeListener) != null) {
            onFocusChangeListener.onFocusChanged(this, this.mFocusedItem);
        }
        this.mPendingFocusChangedEvent = false;
        int min = Math.min(this.mInternalItemList.size(), this.mDrawnItemsLimit);
        boolean[] zArr = this.mInternalItemDisplayedList;
        if (zArr == null || zArr.length != min) {
            this.mInternalItemDisplayedList = new boolean[min];
        }
        for (int i = min - 1; i >= 0; i--) {
            Item item = getItem(i);
            if (item != null) {
                projection.toPixels(item.getPoint(), this.mCurScreenCoords);
                calculateItemRect(item, this.mCurScreenCoords, this.itemRect);
                this.mInternalItemDisplayedList[i] = onDrawItem(canvas, item, this.mCurScreenCoords, projection);
            }
        }
    }

    protected final void populate() {
        int size = size();
        this.mInternalItemList.clear();
        this.mInternalItemList.ensureCapacity(size);
        for (int i = 0; i < size; i++) {
            this.mInternalItemList.add(createItem(i));
        }
        this.mInternalItemDisplayedList = null;
    }

    public final Item getItem(int i) {
        try {
            return this.mInternalItemList.get(i);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    protected boolean onDrawItem(Canvas canvas, Item item, Point point, Projection projection) {
        int i = (this.mDrawFocusedItem && this.mFocusedItem == item) ? 4 : 0;
        Drawable defaultMarker = item.getMarker(i) == null ? getDefaultMarker(i) : item.getMarker(i);
        boundToHotspot(defaultMarker, item.getMarkerHotspot());
        int i2 = this.mCurScreenCoords.x;
        int i3 = this.mCurScreenCoords.y;
        defaultMarker.copyBounds(this.mRect);
        this.mMarkerRect.set(this.mRect);
        this.mRect.offset(i2, i3);
        RectL.getBounds(this.mRect, i2, i3, projection.getOrientation(), this.mOrientedMarkerRect);
        boolean intersects = Rect.intersects(this.mOrientedMarkerRect, canvas.getClipBounds());
        if (intersects) {
            if (projection.getOrientation() != 0.0f) {
                canvas.save();
                canvas.rotate(-projection.getOrientation(), i2, i3);
            }
            defaultMarker.setBounds(this.mRect);
            defaultMarker.draw(canvas);
            if (projection.getOrientation() != 0.0f) {
                canvas.restore();
            }
            defaultMarker.setBounds(this.mMarkerRect);
        }
        return intersects;
    }

    public List<Item> getDisplayedItems() {
        ArrayList arrayList = new ArrayList();
        if (this.mInternalItemDisplayedList == null) {
            return arrayList;
        }
        int i = 0;
        while (true) {
            boolean[] zArr = this.mInternalItemDisplayedList;
            if (i >= zArr.length) {
                return arrayList;
            }
            if (zArr[i]) {
                arrayList.add(getItem(i));
            }
            i++;
        }
    }

    protected Drawable getDefaultMarker(int i) {
        OverlayItem.setState(this.mDefaultMarker, i);
        return this.mDefaultMarker;
    }

    protected boolean hitTest(Item item, Drawable drawable, int i, int i2) {
        return drawable.getBounds().contains(i, i2);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        int size = size();
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        for (int i = 0; i < size; i++) {
            if (isEventOnItem(getItem(i), round, round2, mapView) && onTap(i)) {
                return true;
            }
        }
        return super.onSingleTapConfirmed(motionEvent, mapView);
    }

    public void setDrawFocusedItem(boolean z) {
        this.mDrawFocusedItem = z;
    }

    public void setFocus(Item item) {
        this.mPendingFocusChangedEvent = item != this.mFocusedItem;
        this.mFocusedItem = item;
    }

    public Item getFocus() {
        return this.mFocusedItem;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r7 != 6) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Drawable boundToHotspot(Drawable drawable, OverlayItem.HotspotPlace hotspotPlace) {
        int i;
        if (hotspotPlace == null) {
            hotspotPlace = OverlayItem.HotspotPlace.BOTTOM_CENTER;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i2 = 0;
        switch (hotspotPlace) {
            case CENTER:
            case BOTTOM_CENTER:
            case TOP_CENTER:
                i = (-intrinsicWidth) / 2;
                break;
            case RIGHT_CENTER:
            case UPPER_RIGHT_CORNER:
            case LOWER_RIGHT_CORNER:
                i = -intrinsicWidth;
                break;
            default:
                i = 0;
                break;
        }
        int i3 = AnonymousClass1.$SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[hotspotPlace.ordinal()];
        if (i3 != 2 && i3 != 8) {
            if (i3 != 10 && i3 != 4) {
                if (i3 != 5) {
                }
            }
            i2 = -intrinsicHeight;
            drawable.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            return drawable;
        }
        i2 = (-intrinsicHeight) / 2;
        drawable.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        return drawable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Rect calculateItemRect(Item item, Point point, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        OverlayItem.HotspotPlace markerHotspot = item.getMarkerHotspot();
        if (markerHotspot == null) {
            markerHotspot = OverlayItem.HotspotPlace.BOTTOM_CENTER;
        }
        int i = (this.mDrawFocusedItem && this.mFocusedItem == item) ? 4 : 0;
        Drawable defaultMarker = item.getMarker(i) == null ? getDefaultMarker(i) : item.getMarker(i);
        int intrinsicWidth = defaultMarker.getIntrinsicWidth();
        int intrinsicHeight = defaultMarker.getIntrinsicHeight();
        switch (AnonymousClass1.$SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[markerHotspot.ordinal()]) {
            case 1:
                int i2 = intrinsicWidth / 2;
                int i3 = intrinsicHeight / 2;
                rect.set(point.x - i2, point.y - i3, point.x + i2, point.y + i3);
                break;
            case 2:
                int i4 = intrinsicHeight / 2;
                rect.set(point.x, point.y - i4, point.x + intrinsicWidth, point.y + i4);
                break;
            case 3:
                rect.set(point.x, point.y, point.x + intrinsicWidth, point.y + intrinsicHeight);
                break;
            case 4:
                rect.set(point.x, point.y - intrinsicHeight, point.x + intrinsicWidth, point.y);
                break;
            case 5:
                int i5 = intrinsicWidth / 2;
                int i6 = intrinsicHeight / 2;
                rect.set(point.x - i5, point.y - i6, point.x + i5, point.y + i6);
                break;
            case 6:
                int i7 = intrinsicWidth / 2;
                rect.set(point.x - i7, point.y - intrinsicHeight, point.x + i7, point.y);
                break;
            case 7:
                int i8 = intrinsicWidth / 2;
                rect.set(point.x - i8, point.y, point.x + i8, point.y + intrinsicHeight);
                break;
            case 8:
                int i9 = intrinsicHeight / 2;
                rect.set(point.x - intrinsicWidth, point.y - i9, point.x, point.y + i9);
                break;
            case 9:
                rect.set(point.x - intrinsicWidth, point.y, point.x, point.y + intrinsicHeight);
                break;
            case 10:
                rect.set(point.x - intrinsicWidth, point.y - intrinsicHeight, point.x, point.y);
                break;
        }
    }

    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.mOnFocusChangeListener = onFocusChangeListener;
    }

    protected boolean isEventOnItem(Item item, int i, int i2, MapView mapView) {
        int i3 = 0;
        if (item == null) {
            return false;
        }
        mapView.getProjection().toPixels(item.getPoint(), this.mCurScreenCoords);
        if (this.mDrawFocusedItem && this.mFocusedItem == item) {
            i3 = 4;
        }
        Drawable marker = item.getMarker(i3);
        if (marker == null) {
            marker = getDefaultMarker(i3);
        }
        boundToHotspot(marker, item.getMarkerHotspot());
        marker.copyBounds(this.mRect);
        this.mRect.offset(this.mCurScreenCoords.x, this.mCurScreenCoords.y);
        RectL.getBounds(this.mRect, this.mCurScreenCoords.x, this.mCurScreenCoords.y, -mapView.getMapOrientation(), this.mOrientedMarkerRect);
        return this.mOrientedMarkerRect.contains(i, i2);
    }
}
