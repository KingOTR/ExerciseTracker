package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Liststar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ListStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getListStar", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_listStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListstarKt {
    private static ImageVector _listStar;

    public static final ImageVector getListStar(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _listStar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ListStar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(34.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.lineTo(216.0f, 58.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(40.0f, 70.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 34.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 134.0f);
        pathBuilder.lineTo(96.0f, 134.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(40.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 186.0f);
        pathBuilder.lineTo(40.0f, 186.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(235.82f, 142.24f);
        pathBuilder.lineTo(212.33f, 161.63f);
        pathBuilder.lineTo(219.49f, 190.56f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.87f, 6.61f);
        pathBuilder.lineTo(184.0f, 181.5f);
        pathBuilder.lineToRelative(-26.62f, 15.67f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.87f, -6.61f);
        pathBuilder.lineToRelative(7.16f, -28.93f);
        pathBuilder.lineToRelative(-23.49f, -19.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.36f, -10.61f);
        pathBuilder.lineToRelative(31.0f, -2.4f);
        pathBuilder.lineToRelative(11.91f, -27.61f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.0f, 0.0f);
        pathBuilder.lineToRelative(11.91f, 27.61f);
        pathBuilder.lineToRelative(31.0f, 2.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.36f, 10.61f);
        pathBuilder.close();
        pathBuilder.moveTo(216.72f, 142.45f);
        pathBuilder.lineTo(196.89f, 140.92f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, -3.61f);
        pathBuilder.lineTo(184.0f, 119.14f);
        pathBuilder.lineToRelative(-7.84f, 18.17f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, 3.61f);
        pathBuilder.lineToRelative(-19.83f, 1.53f);
        pathBuilder.lineToRelative(14.94f, 12.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, 6.07f);
        pathBuilder.lineToRelative(-4.63f, 18.74f);
        pathBuilder.lineTo(181.0f, 169.37f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.08f, 0.0f);
        pathBuilder.lineToRelative(17.37f, 10.22f);
        pathBuilder.lineToRelative(-4.63f, -18.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, -6.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _listStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
